package com.harana.slinky.bootstrap.radio

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/Radio", "Radio")
@js.native
object ReactRadio extends js.Object

@react object Radio extends ExternalComponent {

  case class Props(inline: Option[Boolean] = None,
                   disabled: Option[Boolean] = None,
                   title: Option[String] = None,
                   validationState: Option[String] = None,
                   bsClass: Option[String] = None)

  override val component = ReactRadio
}