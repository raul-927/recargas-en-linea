package com.recargas.application.services;

import com.recargas.domain.ports.in.recarga.CreateRecargaIn;
import com.recargas.domain.ports.in.recarga.DeleteRecargaIn;
import com.recargas.domain.ports.in.recarga.SelectRecargaIn;
import com.recargas.domain.ports.in.recarga.UpdateRecargaIn;

public interface RecargaService extends CreateRecargaIn, UpdateRecargaIn, DeleteRecargaIn, SelectRecargaIn {

}
