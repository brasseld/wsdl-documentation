// NOTICE!! DO NOT USE ANY OF THIS JAVASCRIPT
// IT'S ALL JUST JUNK FOR OUR DOCS!
// ++++++++++++++++++++++++++++++++++++++++++

!function ($) {

  $(function(){

    var $window = $(window)
	
    // side bar
    $('.bs-docs-sidenav').affix({
      offset: {
        bottom: 270
      }
    })

    // make code pretty
    window.prettyPrint && prettyPrint()
	
  })

}(window.jQuery)