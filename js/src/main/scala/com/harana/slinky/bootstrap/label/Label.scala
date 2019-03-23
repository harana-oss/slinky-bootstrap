package com.harana.slinky.bootstrap.label

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/Jumbotron", "Jumbotron")
@js.native
object ReactImage extends js.Object

@react object Image extends ExternalComponent {

  case class Props(bsStyle: Option[String] = None,
                   bsClass: Option[String] = None)

  override val component = ReactImage
}