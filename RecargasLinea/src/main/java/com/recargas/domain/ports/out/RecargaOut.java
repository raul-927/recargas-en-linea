package com.recargas.domain.ports.out;

import java.util.List;

import com.recargas.domain.models.Recarga;

public interface RecargaOut {
	Recarga createRecarga(Recarga recarga);
	void deleteRecarga(int id);
	List<Recarga> findAllRecargas();
	Recarga findRecargaById(int id);
	Recarga updateRecarga(Recarga recarga);
}
