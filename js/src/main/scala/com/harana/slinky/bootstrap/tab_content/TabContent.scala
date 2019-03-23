package com.harana.slinky.bootstrap.tab_content

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/lib/TabContent", "TabContent")
@js.native
object ReactTabContent extends js.Object

@react object TabContent extends ExternalComponent {

  case class Props(componentClass: Option[String] = None,
                   animation: Option[Boolean] = None,
                   mountOnEnter: Option[Boolean] = None,
                   unmountOnExit: Option[Boolean] = None,
                   bsClass: Option[String] = None)

  override val component = ReactTabContent
}