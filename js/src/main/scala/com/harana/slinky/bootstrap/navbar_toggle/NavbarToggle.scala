package com.harana.slinky.bootstrap.navbar_toggle

import slinky.core.ExternalComponent
import slinky.core.annotations.react
import slinky.core.facade.ReactElement

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/lib/NavbarToggle", JSImport.Default)
@js.native
object ReactNavbarToggle extends js.Object

@react object NavbarToggle extends ExternalComponent {

  case class Props(onClick: Option[() => Unit] = None,
                   children: Seq[ReactElement])

  override val component = ReactNavbarToggle
}