package com.harana.slinky.bootstrap.badge

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/lib/Badge", "Badge")
@js.native
object ReactBadge extends js.Object

@react object Badge extends ExternalComponent {

  case class Props(pullRight: Option[Boolean] = None,
                   bsClass: Option[String] = None)

  override val component = ReactBadge
}