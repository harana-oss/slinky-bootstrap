package com.harana.slinky.bootstrap.navbar_collapse

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/lib/NavbarCollapse", JSImport.Default)
@js.native
object ReactNavbarCollapse extends js.Object

@react object NavbarCollapse extends ExternalComponent {

  case class Props(bsPrefix: Option[String] = None)

  override val component = ReactNavbarCollapse
}