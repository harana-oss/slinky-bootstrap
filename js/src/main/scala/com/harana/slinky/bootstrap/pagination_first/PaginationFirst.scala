package com.harana.slinky.bootstrap.pagination_first

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/lib/PaginationFirst", "PaginationFirst")
@js.native
object ReactPaginationFirst extends js.Object

@react object PaginationFirst extends ExternalComponent {

  type Props = Unit

  override val component = ReactPaginationFirst
}