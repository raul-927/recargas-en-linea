package com.recargas.infrastructure.entitys;

import java.io.Serializable;
import java.math.BigDecimal;

import com.recargas.domain.models.Operador;
import com.recargas.domain.models.Persona;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SqlResultSetMapping;
import jakarta.persistence.Table;
import jakarta.persistence.ConstructorResult;
import jakarta.persistence.ColumnResult;
import com.recargas.domain.dto.TotalDto;

@Entity
@NamedNativeQuery(
	    name = "find_total_operador",
	    		query ="SELECT SUM(r.valor) as total, p.nombre, o.nombre as operador\n"
	    	    		+ "FROM recarga r, venta v, operador o, persona p \n"
	    	    		+ "WHERE r.recarga_id = v.recarga_recarga_id \n"
	    	    		+ "AND o.operador_id = v.operador_operador_id \n"
	    	    		+ "AND v.persona_persona_id = p.persona_id \n"
	    	    		+ "AND o.operador_id =:operadorId\n"
	    	    		+ "GROUP BY 2",
	    resultSetMapping = "total_operador"
	)
	@SqlResultSetMapping(
	    name = "total_operador",
	    classes = @ConstructorResult(
	        targetClass = TotalDto.class,
	        columns = {
	            @ColumnResult(name = "total", type = Integer.class),
	            @ColumnResult(name = "nombre", type = String.class),
	            @ColumnResult(name = "operador", type = String.class)
	        }
	    )
	)
@Table(name ="venta")
public class VentaEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ventaId;
	@OneToOne
	private PersonaEntity persona;
	
	@OneToOne
	private OperadorEntity operador;
	
	@OneToOne
	private RecargaEntity recarga;
	
	private long nroCelular;
	
	
	
	public OperadorEntity getOperador() {
		return operador;
	}
	public void setOperador(OperadorEntity operador) {
		this.operador = operador;
	}
	public int getVentaId() {
		return ventaId;
	}
	public void setVentaId(int ventaId) {
		this.ventaId = ventaId;
	}
	public PersonaEntity getPersona() {
		return persona;
	}
	public void setPersona(PersonaEntity persona) {
		this.persona = persona;
	}
	public long getNroCelular() {
		return nroCelular;
	}
	public void setNroCelular(long nroCelular) {
		this.nroCelular = nroCelular;
	}
	public RecargaEntity getRecarga() {
		return recarga;
	}
	public void setRecarga(RecargaEntity recarga) {
		this.recarga = recarga;
	}

}
