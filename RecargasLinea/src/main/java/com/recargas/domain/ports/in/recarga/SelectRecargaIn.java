package com.recargas.domain.ports.in.recarga;

import java.util.List;

import com.recargas.domain.models.Recarga;

public interface SelectRecargaIn {
	List<Recarga> findAllRecargas();
	Recarga findRecargaById(int id);
}
