package com.harana.slinky.bootstrap.pager_item

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/lib/PagerItem", JSImport.Default)
@js.native
object ReactPagerItem extends js.Object

@react object PagerItem extends ExternalComponent {

  case class Props(disabled: Option[Boolean],
                   previous: Option[Boolean],
                   next: Option[Boolean],
                   onClick: Option[() => Unit],
                   onSelect: Option[() => Unit],
                   eventKey: Option[js.Any] = None)

  override val component = ReactPagerItem
}