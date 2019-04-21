 
 package br.ufjf.dcc193.trabalho1_dcc193.Controlador;

import java.util.List;
import br.ufjf.dcc193.trabalho1_dcc193.Modelo.Sede;
import br.ufjf.dcc193.trabalho1_dcc193.Repositorio.SedeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;



@RestController
 public class SedeController {

@Autowired
private SedeRepository repsede;   

@RequestMapping("sede.html")
ModelAndView sede(Sede s){
ModelAndView mv = new ModelAndView();
mv.setViewName("sede");
mv.addObject("sede",s);
return mv;
}

@RequestMapping("form-sede.html")
String form(){
    return "form-sede";
}

@RequestMapping("sedes-lista.html")
ModelAndView sedes (){
    ModelAndView mv = new ModelAndView();
    mv.setViewName("sede-list");
    List<Sede> sedes = repsede.findAll();
    mv.addObject("totalsede", sedes);
    return mv;
}

@RequestMapping("novasede.html")
ModelAndView novasede(Sede s){
    ModelAndView mv = new ModelAndView();
    mv.setViewName("nova_sede");
    repsede.save(s);
    mv.addObject("nsede", s);
    return mv;
}
}




