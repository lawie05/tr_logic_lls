package controllers

import javax.inject._
import play.api.mvc._
import views.html.index

@Singleton
class HomeController @Inject()(val controllerComponents: ControllerComponents,
                               indexTemplate: index) extends BaseController {

  def index = Action {
    Ok(indexTemplate())
  }

}
