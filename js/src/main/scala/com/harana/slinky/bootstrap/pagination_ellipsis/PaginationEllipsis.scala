package com.harana.slinky.bootstrap.pagination_ellipsis

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/lib/PaginationEllipsis", "PaginationEllipsis")
@js.native
object ReactPaginationEllipsis extends js.Object

@react object PaginationEllipsis extends ExternalComponent {

  type Props = Unit

  override val component = ReactPaginationEllipsis
}