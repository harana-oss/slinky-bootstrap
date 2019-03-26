package com.harana.slinky.bootstrap.pager

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/lib/Pager", JSImport.Default)
@js.native
object ReactPager extends js.Object

@react object Pager extends ExternalComponent {

  case class Props(onSelect: Option[() => Unit],
                   bsClass: Option[String] = None)

  override val component = ReactPager
}