package com.harana.slinky.bootstrap.pagination_prev

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/lib/PaginationPrev", "PaginationPrev")
@js.native
object ReactPaginationPrev extends js.Object

@react object PaginationPrev extends ExternalComponent {

  type Props = Unit

  override val component = ReactPaginationPrev
}