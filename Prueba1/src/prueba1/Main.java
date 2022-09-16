package prueba1;
import java.util.Date;
import java.util.Scanner;
import prueba1.DTO.Usuarios;
import prueba1.DTO.Clubes_deportivos;
import prueba1.DTO.Suscripciones;

public class Main {

    public static void main(String[] args) {
        Usuarios user1 = new Usuarios();
        user1.setNombre("Cesar Maureira");
        user1.setRut(19004167);
        user1.setDV("0");
        user1.setID(1000);
        user1.setfNacimiento(1995, 3, 3);
        user1.setTelefono("56950465083");
        user1.seteMail("ces.maureira@duocuc.cl");
        user1.setUsuario("Cuchencitio");
        user1.setPassword("Cuchencitio123123");
        Clubes_deportivos club1 = new Clubes_deportivos();
        club1.setNombreClub("Cebollitas FC");
        club1.setCodigo(10);
        club1.setNombreFundador("El Maquinon");
        club1.setAnioFundacion(1990);
        club1.setPaisOrigen("Titirilquen");
        club1.setLema("Hasta la victoria siempre");
        club1.setColores("Rojo");
        club1.setColores("Negro");
        club1.setValorSuscripcion(10000);
        Suscripciones sus1 = new Suscripciones();
        sus1.setAbonoTotal(club1.getValorSuscripcion());
        sus1.Suscribirce(2022, 9, 15, club1.getValorSuscripcion(), club1.getCodigo(), sus1.getAbonoTotal(), 10000, 1000);
        sus1.detalleSuscripcion();
    }
    
}
