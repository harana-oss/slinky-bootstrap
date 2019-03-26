package com.harana.slinky.bootstrap.clearfix

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/lib/Clearfix", JSImport.Default)
@js.native
object ReactClearfix extends js.Object

@react object Clearfix extends ExternalComponent {

  case class Props(componentClass: Option[String] = None,
                   visibleXsBlock: Option[Boolean] = None,
                   visibleSmBlock: Option[Boolean] = None,
                   visibleMdBlock: Option[Boolean] = None,
                   visibleLgBlock: Option[Boolean] = None,
                   bsClass: Option[String] = None)

  override val component = ReactClearfix
}