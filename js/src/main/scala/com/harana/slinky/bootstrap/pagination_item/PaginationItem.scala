package com.harana.slinky.bootstrap.pagination_item

import slinky.core.ExternalComponent
import slinky.core.annotations.react
import slinky.core.facade.ReactElement

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/lib/PaginationItem", JSImport.Default)
@js.native
object ReactPaginationItem extends js.Object

@react object PaginationItem extends ExternalComponent {

  case class Props(active: Boolean,
                   disabled: Boolean,
                   children: Seq[ReactElement])

  override val component = ReactPaginationItem
}