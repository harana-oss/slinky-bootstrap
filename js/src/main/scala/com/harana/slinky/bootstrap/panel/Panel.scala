package com.harana.slinky.bootstrap.panel

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/lib/Panel", JSImport.Default)
@js.native
object ReactPanel extends js.Object

@react object Panel extends ExternalComponent {

  case class Props(expanded: Option[Boolean] = None,
                   onToggle: Option[Boolean => Unit] = None,
                   eventKey: Option[js.Any] = None,
                   id: Option[String] = None)

  override val component = ReactPanel
}