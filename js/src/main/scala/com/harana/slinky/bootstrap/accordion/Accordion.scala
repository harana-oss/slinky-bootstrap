package com.harana.slinky.bootstrap.accordion

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/Accordion", "Accordion")
@js.native
object ReactAccordion extends js.Object

@react object Accordion extends ExternalComponent {

  case class Props(expanded: Option[Boolean] = None,
                   onToggle: Option[Boolean => Unit] = None,
                   eventKey: Option[js.Any] = None,
                   id: Option[String] = None)

  override val component = ReactAccordion
}