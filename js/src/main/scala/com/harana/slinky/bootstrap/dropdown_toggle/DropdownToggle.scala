package com.harana.slinky.bootstrap.dropdown_toggle

import com.harana.slinky.bootstrap.ReactNode
import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/lib/DropdownToggle", JSImport.Default)
@js.native
object ReactDropdownToggle extends js.Object

@react object DropdownToggle extends ExternalComponent {

  case class Props(noCaret: Option[Boolean] = None,
                   open: Option[Boolean] = None,
                   title: ReactNode,
                   useAnchor: Option[Boolean] = None)

  override val component = ReactDropdownToggle
}