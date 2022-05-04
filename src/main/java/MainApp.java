import controller.UserController;
import io.javalin.Javalin;

public class MainApp {
    public static void main(String[] args) {
        Javalin app = Javalin.create().start(7777);
        app.get("/", c -> c.result("Hello word"));
        app.get("/users/{name}", UserController.findBookByName);
        app.post("/users", UserController.createUser);
    }
}

