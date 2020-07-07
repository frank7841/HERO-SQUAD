import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import static spark.Spark.*;
public class App {

    public static void main(String[] args){

        staticFileLocation("/public");
        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());
        //Routing to new add new squad
        get("/squads/new", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "squadform.hbs");
        }, new HandlebarsTemplateEngine());

        get("/receivedsquad", (req, res) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            ArrayList<MySquad> squads = MySquad.getAll();
            model.put("squads", squads);
            return new ModelAndView(model, "display.hbs");
        }, new HandlebarsTemplateEngine());

    }
}
