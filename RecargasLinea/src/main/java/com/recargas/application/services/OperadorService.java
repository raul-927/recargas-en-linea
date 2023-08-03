package com.recargas.application.services;

import com.recargas.domain.ports.in.operador.CreateOperadorIn;
import com.recargas.domain.ports.in.operador.DeleteOperadorIn;
import com.recargas.domain.ports.in.operador.SelectOperadorIn;
import com.recargas.domain.ports.in.operador.UpdateOperadorIn;

public interface OperadorService extends CreateOperadorIn, DeleteOperadorIn, UpdateOperadorIn, SelectOperadorIn {

}
