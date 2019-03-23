package com.harana.slinky.bootstrap.table

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/Table", "Table")
@js.native
object ReactTable extends js.Object

@react object Table extends ExternalComponent {

  case class Props(striped: Option[Boolean] = None,
                   bordered: Option[Boolean] = None,
                   condensed: Option[Boolean] = None,
                   hover: Option[Boolean] = None,
                   responsive: Option[Boolean] = None,
                   bsClass: Option[String] = None)

  override val component = ReactTable
}