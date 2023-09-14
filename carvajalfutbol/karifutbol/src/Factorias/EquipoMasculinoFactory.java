package Factorias;
import Partes.Arquero;
import Partes.ArqueroHombre;
import Partes.Atacantes;
import Partes.Defensor;

public class EquipoMasculinoFactory extends EquipoFactory{

    @Override
    public Arquero crearArquero() {
        // TODO Auto-generated method stub
        return new ArqueroHombre();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    @Override
    public Atacantes creAtacantes() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Defensor creaDefensor() {
        // TODO Auto-generated method stub
        return null;
    }
}
