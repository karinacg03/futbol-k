package Factorias;
import Partes.Arquero;
import Partes.ArqueroMujer;
import Partes.Atacantes;
import Partes.AtacantesMujer;
import Partes.Defensor;
import Partes.DefensorMujer;

public class EquipoFemenino extends EquipoFactory {

    @Override
    public Arquero crearArquero() {
        return new ArqueroMujer();
    }

    @Override
    public Atacantes creAtacantes() {
        return new AtacanteMujer();
    }

    @Override
    public Defensor creaDefensor() {
        return new DefensorMujer();
    }
    
}
