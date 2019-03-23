package com.harana.slinky.bootstrap.grid

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/Grid", "Grid")
@js.native
object ReactGrid extends js.Object

@react object Grid extends ExternalComponent {

  case class Props(fluid: Option[Boolean] = None,
                   componentClass: Option[String] = None,
                   bsClass: Option[String] = None)

  override val component = ReactGrid
}