package com.harana.slinky.bootstrap.pagination_next

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/PaginationNext", "PaginationNext")
@js.native
object ReactPaginationNext extends js.Object

@react object PaginationNext extends ExternalComponent {

  type Props = Unit

  override val component = ReactPaginationNext
}