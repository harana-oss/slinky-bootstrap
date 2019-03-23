package com.harana.slinky.bootstrap.help_block

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/lib/HelpBlock", "HelpBlock")
@js.native
object ReactHelpBlock extends js.Object

@react object HelpBlock extends ExternalComponent {

  case class Props(bsClass: Option[String] = None)

  override val component = ReactHelpBlock
}