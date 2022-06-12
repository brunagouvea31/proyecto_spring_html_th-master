package com.example.proyecto_spring_html_th;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

@Controller
public class PersonController {
    @GetMapping("/Person")
    String getPerson(Model model) throws ParseException{
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Person miPerson = new Person();
        model.addAttribute("attrPerson", Arrays.asList(
                new Person ("Bob Esponja", "Pantalones Cuadrados", "Fondo de Bikini, En una piña", formato.parse("14/06/1986")),
                new Person ("Patricio", "Estrella", "Fondo de Bikini, En un roca", formato.parse("14/06/1986")),
                new Person ("Calamardo", "Tentaculos", "Fondo de Bikini, En una cabeza", formato.parse("23/10/1975"))
        ));
        return "Person";
    }
    @GetMapping("/PersonCard")
    String getPersonCard(Model model) throws ParseException{
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        PersonCard miPersonCard = new  PersonCard();
        model.addAttribute("attrPersonCard", Arrays.asList(
                new PersonCard ("Bob Esponja", "Pantalones Cuadrados", "http://data.pixiz.com/output/user/frame/preview/api/big/2/9/8/8/588892_8d750.jpg","Fondo de Bikini, En una piña", formato.parse("14/06/1986")),
                new PersonCard ("Patricio", "Estrella", "https://fotos01.deia.eus/2020/08/12/328x206/bobesponja.jpg","Fondo de Bikini, En un roca", formato.parse("14/06/1986")),
                new PersonCard ("Calamardo", "Tentaculos", "http://pm1.narvii.com/6875/88f4aa77e783e2a87afa1be7dc9cd32103fcb0d1r1-480-595v2_00.jpg","Fondo de Bikini, En una cabeza", formato.parse("23/10/1975"))
        ));
        return "PersonCard";
    }
    @GetMapping("/")
    String getHome(Model model) throws ParseException{
        Home miHome = new  Home("Esta en el Home");
        //Ahora preparo el envio de datos
        model.addAttribute("datosHome", miHome);

        return "index";
    }

    @GetMapping("/QuienesSomos")
    String getQuienesSomos(Model model) throws ParseException{
        QuienesSomos miQuienesSomos = new  QuienesSomos("https://asociaciondec.org/wp-content/uploads/2019/02/eoi1.png", "EOI fue fundada el 12 de julio de 1955 fruto del acuerdo alcanzado entre los Ministerios de Educación e Industria, convirtiéndose así en la primera escuela de negocios de España y una de las primeras de Europa.\n" +
                "\n" +
                "En estos más de 60 años hemos contribuido decididamente a la modernización de la economía e industria española y hemos sido protagonistas de algunos hitos importantes en la formación de directivos en España. Este recorrido por la historia del país se puede consultar en el libro \"EOI, 50 años de vanguardia” y en la trilogía “El Gran Viaje” (Energía, Turismo  e Industria ) que publicamos con motivo del 60 aniversario de la Escuela.");
        model.addAttribute("attrQuienes", miQuienesSomos);

        return "QuienesSomos";
    }
    @GetMapping("/Contacto")
    String getContacto(Model model) throws ParseException{
        Contacto miContacto = new  Contacto("administracionjava@eoi.es","Teléfono: 958 33 85 66");
        model.addAttribute("attrContacto", miContacto);

        return "Contacto";
    }
    @GetMapping("/Calendario")
    String getCalendario(Model model) throws ParseException{
        Calendario miCalendario = new  Calendario("Accion del calendario");
        model.addAttribute(miCalendario);

        return "Calendario";
    }
    @GetMapping("/createCalendario")
    public String createCalendario(Calendario calendario) {
        // Servicio conectado a la BBDD donde puedo controlar la entrada de datos
        // objetoDeLecturaServicio
        // En este ejemplo mostramos por consola en url indicada
        System.out.println("Calendario = " + calendario.getActionText());
        return "Calendario";
    }

}
