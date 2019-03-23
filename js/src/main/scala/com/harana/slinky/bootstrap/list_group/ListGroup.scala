package com.harana.slinky.bootstrap.list_group

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/ListGroup", "ListGroup")
@js.native
object ReactListGroup extends js.Object

@react object ListGroup extends ExternalComponent {

  case class Props(componentClass: Option[String] = None,
                   bsClass: Option[String] = None)

  override val component = ReactListGroup
}