package com.harana.slinky.bootstrap.tab

import com.harana.slinky.bootstrap.ReactNode
import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/lib/Tab", "Tab")
@js.native
object ReactTab extends js.Object

@react object Tab extends ExternalComponent {

  case class Props(disabled: Option[Boolean] = None,
                   title: Option[ReactNode] = None,
                   tabClassName: Option[String] = None,
                   bsClass: Option[String] = None)

  override val component = ReactTab
}