package com.harana.slinky.bootstrap.pagination

import slinky.core.ExternalComponent
import slinky.core.annotations.react
import slinky.core.facade.ReactElement

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/Pagination", "Pagination")
@js.native
object ReactPagination extends js.Object

@react object Pagination extends ExternalComponent {

  case class Props(children: Seq[ReactElement])

  override val component = ReactPagination
}