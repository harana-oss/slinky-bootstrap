package com.harana.slinky.bootstrap.jumbotron

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/lib/Jumbotron", JSImport.Default)
@js.native
object ReactImage extends js.Object

@react object Image extends ExternalComponent {

  case class Props(componentClass: Option[String] = None,
                   bsClass: Option[String] = None)

  override val component = ReactImage
}