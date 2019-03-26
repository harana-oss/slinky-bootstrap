package com.harana.slinky.bootstrap.pagination_last

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/lib/PaginationLast", JSImport.Default)
@js.native
object ReactPaginationLast extends js.Object

@react object PaginationLast extends ExternalComponent {

  type Props = Unit

  override val component = ReactPaginationLast
}