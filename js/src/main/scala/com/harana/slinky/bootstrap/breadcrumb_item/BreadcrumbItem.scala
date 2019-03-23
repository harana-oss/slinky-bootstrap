package com.harana.slinky.bootstrap.breadcrumb_item

import com.harana.slinky.bootstrap.ReactNode
import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/BreadcrumbItem", "BreadcrumbItem")
@js.native
object ReactBreadcrumbItem extends js.Object

@react object BreadcrumbItem extends ExternalComponent {

  case class Props(active: Option[Boolean] = None,
                   href: Option[String] = None,
                   title: Option[ReactNode] = None,
                   target: Option[String] = None)

  override val component = ReactBreadcrumbItem
}