package com.harana.slinky.bootstrap.progress_bar

import com.harana.slinky.bootstrap.ReactNode
import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/lib/ProgressBar", JSImport.Default)
@js.native
object ReactProgressBar extends js.Object

@react object ProgressBar extends ExternalComponent {

  case class Props(min: Option[Int] = None,
                   now: Option[Int] = None,
                   max: Option[Int] = None,
                   label: Option[ReactNode] = None,
                   srOnly: Option[Boolean] = None,
                   striped: Option[Boolean] = None,
                   active: Option[Boolean] = None)

  override val component = ReactProgressBar
}