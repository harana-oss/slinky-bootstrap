package com.harana.slinky.bootstrap.list_group_item

import com.harana.slinky.bootstrap.ReactNode
import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/lib/ListGroupItem", "ListGroupItem")
@js.native
object ReactListGroup extends js.Object

@react object ListGroup extends ExternalComponent {

  case class Props(active: Option[js.Any] = None,
                   disabled: Option[js.Any] = None,
                   header: Option[ReactNode] = None,
                   listItem: Option[Boolean] = None,
                   href: Option[String] = None,
                   `type`: Option[String] = None,
                   bsStyle: Option[String] = None,
                   bsClass: Option[String] = None)

  override val component = ReactListGroup
}