package com.harana.slinky.bootstrap.navbar_brand

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/lib/NavbarBrand", "NavbarBrand")
@js.native
object ReactNavbarBrand extends js.Object

@react object NavbarBrand extends ExternalComponent {

  case class Props(as: Option[String] = None,
                   href: Option[String] = None,
                   bsPrefix: Option[String] = None)

  override val component = ReactNavbarBrand
}