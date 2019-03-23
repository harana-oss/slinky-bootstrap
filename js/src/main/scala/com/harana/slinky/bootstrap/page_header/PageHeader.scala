package com.harana.slinky.bootstrap.page_header

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/lib/PageHeader", "PageHeader")
@js.native
object ReactPageHeader extends js.Object

@react object PageHeader extends ExternalComponent {

  case class Props(bsClass: Option[String] = None)

  override val component = ReactPageHeader
}