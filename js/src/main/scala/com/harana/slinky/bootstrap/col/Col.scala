  package com.harana.slinky.bootstrap.col

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/lib/Col", JSImport.Default)
@js.native
object ReactCol extends js.Object

@react object Col extends ExternalComponent {

  case class Props(componentClass: Option[String] = None,
                   xs: Option[Int] = None,
                   sm: Option[Int] = None,
                   md: Option[Int] = None,
                   lg: Option[Int] = None,
                   xsHidden: Option[Int] = None,
                   smHidden: Option[Int] = None,
                   mdHidden: Option[Int] = None,
                   lgHidden: Option[Int] = None,
                   xsOffset: Option[Int] = None,
                   smOffset: Option[Int] = None,
                   mdOffset: Option[Int] = None,
                   lgOffset: Option[Int] = None,
                   xsPush: Option[Int] = None,
                   smPush: Option[Int] = None,
                   mdPush: Option[Int] = None,
                   lgPush: Option[Int] = None,
                   xsPull: Option[Int] = None,
                   smPull: Option[Int] = None,
                   mdPull: Option[Int] = None,
                   lgPull: Option[Int] = None,
                   bsClass: Option[String] = None)

  override val component = ReactCol
}