import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import static spark.Spark.*;
public class App {
    static int getHerokuAssignedPort() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
        return 4567; //return default port if heroku-port isn't set (i.e. on localhost)
    }
    public static void main(String[] args) {

        port(getHerokuAssignedPort());
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
        //view squad details

        get("/receivedsquad", (req, res) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            ArrayList<MySquad> squads = MySquad.getAll();
            model.put("squads", squads);
            return new ModelAndView(model, "display.hbs");
        }, new HandlebarsTemplateEngine());

        get("/success", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "success.hbs");
        }, new HandlebarsTemplateEngine());
        //display Heroes

        get("/receivedheroes", (req, res) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            ArrayList<MyHero> heroes = MyHero.getAll();
            model.put("heroes", heroes);
            return new ModelAndView(model, "displayheroes.hbs");
        }, new HandlebarsTemplateEngine());

        //display hero details
        get("/herosdetails", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "display.hbs");
        }, new HandlebarsTemplateEngine());
        //Getting hero form
        get("/heroform/new", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "heroform.hbs");
        }, new HandlebarsTemplateEngine());
            //posting new squad
        post("/squads/new", (request, response) -> {
                    Map<String, Object> model = new HashMap<>();
                    String name = request.queryParams("squadName");
                    String cause = request.queryParams("cause");
                    int size=Integer.parseInt(request.queryParams("size"));
                    MySquad newSquad = new MySquad(size,name, cause);
                    model.put("squads", MySquad.getAll());
                    return new ModelAndView(model, "success.hbs");
                }, new HandlebarsTemplateEngine());
        //Post Hero Details
        post("/heroform/new", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            String sname = request.queryParams("squadName");
            String name = request.queryParams("name");
            int age = Integer.parseInt(request.queryParams("age"));
            String power = request.queryParams("specialPower");
            String weakness = request.queryParams("weakness");
            MyHero newMember = new MyHero(name, age, power,weakness);
            model.put("heros", MyHero.getAll());
            return new ModelAndView(model, "herosucess.hbs");
        }, new HandlebarsTemplateEngine());


    }
}
