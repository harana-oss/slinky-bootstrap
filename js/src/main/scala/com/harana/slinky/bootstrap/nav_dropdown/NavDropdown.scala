package com.harana.slinky.bootstrap.nav_dropdown

import com.harana.slinky.bootstrap.ReactNode
import slinky.core.ExternalComponent
import slinky.core.annotations.react
import slinky.core.facade.ReactElement

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@JSImport("react-bootstrap/lib/Nav", JSImport.Default)
@js.native
object ReactNavDropdown extends js.Object

@react object NavDropdown extends ExternalComponent {

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
                   rootCloseEvent: Option[String] = None,
                   title: ReactNode,
                   noCaret: Option[Boolean] = None,
                   active: Option[Boolean] = None,
                   activeKey: Option[js.Any] = None,
                   activeHref: Option[String] = None,
                   children: Seq[ReactElement])

  override val component = ReactNavDropdown
}