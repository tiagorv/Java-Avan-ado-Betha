import ListController from './list.controller'
import FormController from './form.controller'

import DoadorServico from './servico'

export const doadorConfig = (modulo) => {

  modulo.service('DoadorServico', DoadorServico)
  
  return ['$stateProvider', '$urlRouterProvider', 
   ($stateProvider, $urlRouterProvider) => {
    $stateProvider
      .state('doador', {
        template: require('@views/default.html'),
        url: '/doadores',
        onEnter: ['$state', function($state) {
          $state.go('doador.list')
        }]
      })
      .state('doador.list', {
        template: require('@views/doadores/list.html'),
        url: '/list',
        controller: ListController,
        controllerAs: 'vm'
      })
      .state('doador.new', {
        template: require('@views/doadores/form.html'),
        url: '/new',
        controller: FormController,
        controllerAs: 'vm'
      })
      .state('doador.edit', {
        template: require('@views/doadores/form.html'),
        url: '/{id}',
        controller: FormController,
        controllerAs: 'vm'
      });
  }]
}
