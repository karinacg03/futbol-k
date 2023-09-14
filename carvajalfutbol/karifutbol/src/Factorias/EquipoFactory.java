package Factorias;

import Partes.Arquero;
import Partes.Atacantes;
import Partes.Defensor;

public abstract class EquipoFactory {

    public abstract Arquero crearArquero();
    public abstract Atacantes creAtacantes();
    public abstract Defensor creaDefensor();
}

