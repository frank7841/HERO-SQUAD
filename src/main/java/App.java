import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import static spark.Spark.*;
public class App {

    public static void main(String[] args){

        staticFileLocation("/public");
        post("/heroform", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
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
