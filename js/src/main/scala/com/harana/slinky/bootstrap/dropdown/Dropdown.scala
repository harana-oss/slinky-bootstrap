package com.harana.slinky.bootstrap.dropdown

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@JSImport("react-bootstrap/lib/Dropdown", JSImport.Default)
@js.native
object ReactDropdown extends js.Object

@react object Dropdown extends ExternalComponent {

  case class Props(dropup: Option[Boolean] = None,
                   id: Option[Int | String] = None,
                   componentClass: Option[String] = None,
                   disabled: Option[Boolean] = None,
                   pullRight: Option[Boolean] = None,
                   open: Option[Boolean] = None,
                   defaultOpen: Option[Boolean] = None,
                   onToggle: Option[(Boolean, js.Object, String) => Unit] = None,
                   onSelect: Option[(js.Any, js.Object) => js.Any] = None,
                   role: Option[String] = None,
                   rootCloseEvent: Option[String] = None)


  override val component = ReactDropdown
}