package com.recargas.application.services;

import com.recargas.domain.ports.in.persona.CreatePersonaIn;
import com.recargas.domain.ports.in.persona.DeletePersonaIn;
import com.recargas.domain.ports.in.persona.SelectPersonaIn;
import com.recargas.domain.ports.in.persona.UpdatePersonaIn;

public interface PersonaService extends CreatePersonaIn, UpdatePersonaIn, DeletePersonaIn, SelectPersonaIn {

}
