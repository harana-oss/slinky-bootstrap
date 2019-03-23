package com.harana.slinky.bootstrap.input_group

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/InputGroup", "InputGroup")
@js.native
object ReactInputGroup extends js.Object

@react object InputGroup extends ExternalComponent {

  case class Props(bsSize: Option[String] = None,
                   bsClass: Option[String] = None)

  override val component = ReactInputGroup
}