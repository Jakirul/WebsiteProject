package uk.ac.city.aczg898.IN1010.Website.CW.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * A controller to handle GET requests to the home and opera pages
 *
 */
@Controller
public class ShoeController {


    /**
     * Controller method to handle a GET request to the / endpoint (homepage)
     *
     * @return ModelAndView returns a view constructed from index.html (no model required)
     */
    @RequestMapping (value = "/")
    public ModelAndView showHome(){
        return new ModelAndView("index");
    }

    /**
     * Controller method to handle a GET request to the /carmen endpoint
     *
     * @return ModelAndView returns a view constructed from carmen.html (no model required)
     */
    @RequestMapping(value = "/Mens.html")
    public ModelAndView showMens(){
        return new ModelAndView("Mens");
    }

    @RequestMapping(value = "/womens.html")
    public ModelAndView showWomens(){
        return new ModelAndView("womens");
    }

    @RequestMapping(value = "/contactus.html")
    public ModelAndView showContactUs(){
        return new ModelAndView("contactus.html");
    }


    @RequestMapping(value = "/mensShoe1.html")
    public ModelAndView showMensShoe1(){
        return new ModelAndView("mensShoe1.html");
    }

    @RequestMapping(value = "/mensShoe2.html")
    public ModelAndView showMensShoe2(){
        return new ModelAndView("mensShoe2.html");
    }

    @RequestMapping(value = "/mensShoe3.html")
    public ModelAndView showMensShoe3(){
        return new ModelAndView("mensShoe3.html");
    }

    @RequestMapping(value = "/mensShoe4.html")
    public ModelAndView showMensShoe4(){
        return new ModelAndView("mensShoe4.html");
    }

    @RequestMapping(value = "/womensShoe1.html")
    public ModelAndView showWomensShoe1(){
        return new ModelAndView("womensShoe1.html");
    }

    @RequestMapping(value = "/womensShoe2.html")
    public ModelAndView showWomensShoe2(){
        return new ModelAndView("womensShoe2.html");
    }

    @RequestMapping(value = "/womensShoe3.html")
    public ModelAndView showWomensShoe3(){
        return new ModelAndView("womensShoe3.html");
    }

    @RequestMapping(value = "/womensShoe4.html")
    public ModelAndView showWomensShoe4(){
        return new ModelAndView("womensShoe4.html");
    }



//    /**
//     * Controller method to handle a GET request to the /flute endpoint
//     *
//     * @return ModelAndView returns a view constructed from flute.html (no model required)
//     */
//    @RequestMapping(value = "/flute")
//    public ModelAndView showFlute(){
//        return new ModelAndView("flute");
//    }
//
//    /**
//     * Controller method to handle a GET request to the /rigoletto endpoint
//     *
//     * @return ModelAndView returns a view constructed from rigoletto.html (no model required)
//     */
//    @RequestMapping(value = "/rigoletto")
//    public ModelAndView showRigoletto(){
//        return new ModelAndView("rigoletto");
//    }
}
