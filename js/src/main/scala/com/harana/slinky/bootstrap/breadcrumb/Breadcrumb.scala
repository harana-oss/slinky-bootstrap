package com.harana.slinky.bootstrap.breadcrumb

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/lib/Breadcrumb", JSImport.Default)
@js.native
object ReactBreadcrumb extends js.Object

@react object Breadcrumb extends ExternalComponent {

  type Props = Unit

  override val component = ReactBreadcrumb
}