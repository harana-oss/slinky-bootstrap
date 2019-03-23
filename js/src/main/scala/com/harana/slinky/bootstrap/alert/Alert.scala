package com.harana.slinky.bootstrap.alert

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/lib/Alert", "Alert")
@js.native
object ReactAlert extends js.Object

@react object Alert extends ExternalComponent {

  case class Props(onDismiss: Option[() => Unit] = None,
                   closeLabel: Option[String] = None,
                   bsStyle: Option[String] = None,
                   bsClass: Option[String] = None)

  override val component = ReactAlert
}